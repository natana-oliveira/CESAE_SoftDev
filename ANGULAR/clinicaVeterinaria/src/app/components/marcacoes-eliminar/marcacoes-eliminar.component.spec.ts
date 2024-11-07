import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarcacoesEliminarComponent } from './marcacoes-eliminar.component';

describe('MarcacoesEliminarComponent', () => {
  let component: MarcacoesEliminarComponent;
  let fixture: ComponentFixture<MarcacoesEliminarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MarcacoesEliminarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MarcacoesEliminarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
