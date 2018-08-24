import { Component, OnInit,Input } from '@angular/core';
import { House } from '../house';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { HouseService }  from '../house.service';

@Component({
  selector: 'app-house-detail',
  templateUrl: './house-detail.component.html',
  styleUrls: ['./house-detail.component.css']
})
export class HouseDetailComponent implements OnInit {
  @Input() house: House;
  constructor(
    private route: ActivatedRoute,
    private houseService: HouseService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getHouse();
  }

  getHouse(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.houseService.getHouse(id).subscribe(house => this.house = house);
 }

 goBack(): void {
  this.location.back();
}

}
