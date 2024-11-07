import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina.component';

describe('SegundaAaaPaginaComponent', () => {
  let component: SegundaAaaPaginaComponent;
  let fixture: ComponentFixture<SegundaAaaPaginaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SegundaAaaPaginaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SegundaAaaPaginaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
