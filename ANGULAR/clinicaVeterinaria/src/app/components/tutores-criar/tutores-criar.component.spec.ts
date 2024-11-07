import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TutoresCriarComponent } from './tutores-criar.component';

describe('TutoresCriarComponent', () => {
  let component: TutoresCriarComponent;
  let fixture: ComponentFixture<TutoresCriarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TutoresCriarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TutoresCriarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
