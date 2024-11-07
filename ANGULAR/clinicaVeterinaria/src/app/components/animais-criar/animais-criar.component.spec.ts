import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimaisCriarComponent } from './animais-criar.component';

describe('AnimaisCriarComponent', () => {
  let component: AnimaisCriarComponent;
  let fixture: ComponentFixture<AnimaisCriarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnimaisCriarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AnimaisCriarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
