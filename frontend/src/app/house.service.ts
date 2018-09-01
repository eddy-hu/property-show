import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { MessageService } from './message.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { House } from './house';


@Injectable({
  providedIn: 'root'

})
export class HouseService {
  private houseUrl = 'http://127.0.0.1:8080/house'; 
  houseSample: House;
 
  constructor(private http: HttpClient,
    private messageService: MessageService) { }

    private log(message: string) {
      this.messageService.add(`HouseService: ${message}`);
    }
    getHouses(): Observable<House[]> {
      return this.http.get<House[]>(this.houseUrl+'/all') .pipe(
        catchError(this.handleError('getHouses', []))
      );
    } 
    getHouse(id: number):  Observable<House>  {
      const url = `${this.houseUrl}/${id}`;
      return this.http.get<House>(url).pipe( 
        tap(_ => this.log(`fetched house id=${id}`)),
      catchError(this.handleError<House>(`getHouse id=${id}`))
    );
  }

  addHouse (house: House): Observable<House> {

    var obj ={
      "houseName": "TEST ADD HOUSE",
      "typeId": 1,
      "areaId": 2,
      "street": "WHERNSIDE TERRACE",
      "city": "Ottawa",
      "postCode": "K2W0C6",
      "country": "Canada",
      "price": 439000,
      "size": 105,
      "rooms": 4,
      "bathRooms": 2,
      "garages": 1,
      "availableDate": "2018-08-29",
      "basement": "2 bedrooms",
      "ac": true,
      "gasHeat": true,
      "fencedYard": true,
      "washerDryer": true,
      "deck": true,
      "balcony": true,
      "storage": true,
      "introduction": "Stunning, shows like a model. Move in and do nothing! Desirable Morgan's Grant. Fully fenced. No rear neighbours",
      "userId": 1
    };

    const url = `${this.houseUrl}/add`;
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };
    return this.http.post<House>(url, obj, httpOptions).pipe(
      tap((house: House) => this.log(`added house w/ id=${house.house_id}`)),
      catchError(this.handleError<House>('addHouse'))
    );
  }
/*
   //needs fix
  updateHouse (house: House): Observable<any> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };
    return this.http.put(this.houseUrl, house, httpOptions).pipe(
      tap(_ => this.log(`updated house id=${house.house_id}`)),
      catchError(this.handleError<any>('updateHouse'))
    );
  }
 //needs fix
  addHouse (house: House): Observable<House> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };
    return this.http.post<House>(this.houseUrl, house, httpOptions).pipe(
      tap((house: House) => this.log(`added house w/ id=${house.house_id}`)),
      catchError(this.handleError<House>('addHouse'))
    );
  }

  deleteHouse (house: House | number): Observable<House> {

    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };
    const id = typeof house === 'number' ? house : house.house_id;
    const url = `${this.houseUrl}/${id}`;
  
    return this.http.delete<House>(url, httpOptions).pipe(
      tap(_ => this.log(`deleted house id=${id}`)),
      catchError(this.handleError<House>('deleteHouse'))
    );
  }


    searchHouses(term: string): Observable<House[]> {
      if (!term.trim()) {
        // if not search term, return empty hero array.
        return of([]);
      }
      return this.http.get<House[]>(`${this.houseUrl}/?name=${term}`).pipe(
        tap(_ => this.log(`found Houses matching "${term}"`)),
        catchError(this.handleError<House[]>('searchHouses', []))
      );
   
    }  */
    private handleError<T> (operation = 'operation', result?: T) {
      return (error: any): Observable<T> => {
        // TODO: send the error to remote logging infrastructure
        console.error(error); // log to console instead
        // TODO: better job of transforming error for user consumption
        this.log(`${operation} failed: ${error.message}`);
        // Let the app keep running by returning an empty result.
        return of(result as T);
      };
}
}
