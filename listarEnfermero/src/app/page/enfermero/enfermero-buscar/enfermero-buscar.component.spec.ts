import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnfermeroBuscarComponent } from './enfermero-buscar.component';

describe('EnfermeroBuscarComponent', () => {
  let component: EnfermeroBuscarComponent;
  let fixture: ComponentFixture<EnfermeroBuscarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnfermeroBuscarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnfermeroBuscarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
