import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HouseDetailComponent } from './house-detail/house-detail.component';
import { HousesComponent } from './houses/houses.component';
import { HouseSearchComponent } from './house-search/house-search.component';
import { MessagesComponent } from './messages/messages.component';
import { AppRoutingModule } from './/app-routing.module';
import { HouseFormComponent } from './house-form/house-form.component';
import { HouseService } from './house.service';
import { IndexComponent } from './index/index.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ServicesComponent } from './services/services.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    HouseDetailComponent,
    HousesComponent,
    HouseSearchComponent,
    MessagesComponent,
    HouseFormComponent,
    IndexComponent,
    AboutComponent,
    ContactComponent,
    ServicesComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [HouseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
