import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CompetitonScheduleComponent } from './competiton-schedule.component';

describe('CompetitonScheduleComponent', () => {
  let component: CompetitonScheduleComponent;
  let fixture: ComponentFixture<CompetitonScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CompetitonScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CompetitonScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
