import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuperapassComponent } from './recuperapass.component';

describe('RecuperapassComponent', () => {
  let component: RecuperapassComponent;
  let fixture: ComponentFixture<RecuperapassComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecuperapassComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecuperapassComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
