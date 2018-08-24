import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HousesComponent } from './houses/houses.component';
import { DashboardComponent }   from './dashboard/dashboard.component';
import { HouseDetailComponent }  from './house-detail/house-detail.component';
import { IndexComponent }   from './index/index.component';
import { ContactComponent }   from './contact/contact.component';
import { AboutComponent }   from './about/about.component';
import { ServicesComponent }   from './services/services.component';

const routes: Routes = [
  { path: '', redirectTo: 'index', pathMatch: 'full' },
  { path: 'index', component: IndexComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'houses', component: HousesComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'about', component: AboutComponent },
  { path: 'services', component: ServicesComponent },
  { path: 'detail/:id', component: HouseDetailComponent }

];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
