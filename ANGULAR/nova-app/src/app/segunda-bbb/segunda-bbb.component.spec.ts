import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SegundaBbbComponent } from './segunda-bbb.component';

describe('SegundaBbbComponent', () => {
  let component: SegundaBbbComponent;
  let fixture: ComponentFixture<SegundaBbbComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SegundaBbbComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SegundaBbbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
