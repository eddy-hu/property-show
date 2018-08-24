import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HouseDetailComponent } from './house-detail.component';

describe('HouseDetailComponent', () => {
  let component: HouseDetailComponent;
  let fixture: ComponentFixture<HouseDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HouseDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HouseDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
