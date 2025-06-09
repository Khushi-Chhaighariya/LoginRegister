import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-forget-password',
  imports: [ReactiveFormsModule, HttpClientModule,CommonModule],
  templateUrl: './forget-password.component.html',
  styleUrl: './forget-password.component.css',
   standalone: true,
})
export class ForgetPasswordComponent {

}
