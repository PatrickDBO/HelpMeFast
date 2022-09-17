import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnfermeroDetailComponent } from './enfermero-detail.component';

describe('EnfermeroDetailComponent', () => {
  let component: EnfermeroDetailComponent;
  let fixture: ComponentFixture<EnfermeroDetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnfermeroDetailComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnfermeroDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
