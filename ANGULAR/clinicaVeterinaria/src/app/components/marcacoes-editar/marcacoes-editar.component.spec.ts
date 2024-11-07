import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarcacoesEditarComponent } from './marcacoes-editar.component';

describe('MarcacoesEditarComponent', () => {
  let component: MarcacoesEditarComponent;
  let fixture: ComponentFixture<MarcacoesEditarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MarcacoesEditarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MarcacoesEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
