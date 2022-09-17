import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnfermeroTableComponent } from './enfermero-table.component';

describe('EnfermeroTableComponent', () => {
  let component: EnfermeroTableComponent;
  let fixture: ComponentFixture<EnfermeroTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnfermeroTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnfermeroTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
