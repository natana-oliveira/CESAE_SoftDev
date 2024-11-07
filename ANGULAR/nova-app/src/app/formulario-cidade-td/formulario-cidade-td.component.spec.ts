import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioCidadeTdComponent } from './formulario-cidade-td.component';

describe('FormularioCidadeTdComponent', () => {
  let component: FormularioCidadeTdComponent;
  let fixture: ComponentFixture<FormularioCidadeTdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormularioCidadeTdComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormularioCidadeTdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
