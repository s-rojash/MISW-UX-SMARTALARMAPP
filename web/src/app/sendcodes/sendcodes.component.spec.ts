import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SendcodesComponent } from './sendcodes.component';

describe('SendcodesComponent', () => {
  let component: SendcodesComponent;
  let fixture: ComponentFixture<SendcodesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SendcodesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SendcodesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
