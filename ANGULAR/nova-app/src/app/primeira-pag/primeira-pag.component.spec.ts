import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeiraPagComponent } from './primeira-pag.component';

describe('PrimeiraPagComponent', () => {
  let component: PrimeiraPagComponent;
  let fixture: ComponentFixture<PrimeiraPagComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PrimeiraPagComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PrimeiraPagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
