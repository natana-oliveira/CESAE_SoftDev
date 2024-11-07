import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundaAaaComponent } from './segunda-aaa.component';

describe('SegundaAaaComponent', () => {
  let component: SegundaAaaComponent;
  let fixture: ComponentFixture<SegundaAaaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SegundaAaaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SegundaAaaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
