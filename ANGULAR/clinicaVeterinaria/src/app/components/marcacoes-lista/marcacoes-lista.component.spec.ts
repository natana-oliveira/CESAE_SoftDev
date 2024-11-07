import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarcacoesListaComponent } from './marcacoes-lista.component';

describe('MarcacoesListaComponent', () => {
  let component: MarcacoesListaComponent;
  let fixture: ComponentFixture<MarcacoesListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MarcacoesListaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MarcacoesListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
