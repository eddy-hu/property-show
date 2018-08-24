import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HouseSearchComponent } from './house-search.component';

describe('HouseSearchComponent', () => {
  let component: HouseSearchComponent;
  let fixture: ComponentFixture<HouseSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HouseSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HouseSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
