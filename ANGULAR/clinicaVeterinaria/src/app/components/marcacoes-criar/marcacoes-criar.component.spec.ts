import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarcacoesCriarComponent } from './marcacoes-criar.component';

describe('MarcacoesCriarComponent', () => {
  let component: MarcacoesCriarComponent;
  let fixture: ComponentFixture<MarcacoesCriarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MarcacoesCriarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MarcacoesCriarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
