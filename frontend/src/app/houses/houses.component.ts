import { Component, OnInit } from '@angular/core';
import { HouseService } from '../house.service';
import { House } from '../house';
@Component({
  selector: 'app-houses',
  templateUrl: './houses.component.html',
  styleUrls: ['./houses.component.css']
})
export class HousesComponent implements OnInit {
 
  houses: House[];
  constructor(private houseService: HouseService) { }

  ngOnInit() {
    this. getHouses()
  }

  getHouses(): void {
    this.houseService.getHouses().subscribe(houses => this.houses = houses);
 }
/*
 delete(house: House): void {
  this.houses = this.houses.filter(h => h !== house);
  this.houseService.deleteHouse(house).subscribe();
}*/
}
