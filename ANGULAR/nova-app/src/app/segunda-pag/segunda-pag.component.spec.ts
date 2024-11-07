import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundaPagComponent } from './segunda-pag.component';

describe('SegundaPagComponent', () => {
  let component: SegundaPagComponent;
  let fixture: ComponentFixture<SegundaPagComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SegundaPagComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SegundaPagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
