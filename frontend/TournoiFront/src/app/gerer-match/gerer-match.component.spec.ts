import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GererMatchComponent } from './gerer-match.component';

describe('GererMatchComponent', () => {
  let component: GererMatchComponent;
  let fixture: ComponentFixture<GererMatchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GererMatchComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GererMatchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
