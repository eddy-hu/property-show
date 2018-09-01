import { Component, OnInit } from '@angular/core';
import { House } from '../house';

@Component({
  selector: 'app-house-add',
  templateUrl: './house-add.component.html',
  styleUrls: ['./house-add.component.css']
})
export class HouseAddComponent implements OnInit {

   submitted = false;
   model = new House;
   /*
   model = new House( "140 WHERNSIDE TERRACE",1,2, "WHERNSIDE TERRACE", "Ottawa", "K2W0C6","Canada",439000, 105, 4, 2, 
   1,"2018-08-29","2 bedrooms", true,true,true,true,true,true,true,"Stunning, shows like a model. Move in and do nothing! Desirable Morgan's Grant. Fully fenced. No rear neighbours", 1);
*/
  onSubmit() { this.submitted = true; }
  get diagnostic() { return JSON.stringify(this.model); }

  constructor() { }

  ngOnInit() {
  }
}
