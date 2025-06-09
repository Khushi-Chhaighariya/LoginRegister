import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, ReactiveFormsModule } from '@angular/forms';
import { error } from 'console';

@Component({
  selector: 'app-register',
  imports: [ReactiveFormsModule, HttpClientModule,CommonModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
register = new FormGroup({
  email: new FormControl(''),
  name: new FormControl(''),
  password: new FormControl('')
});

constructor(private httpClient: HttpClient){}
 public handleSubmit(){
  console.log(this.register.value);
  this.httpClient.post('http://localhost:8081/api/addUser', this.register.value).subscribe((data:any) =>{
  alert("Registration Successfully !!")
  }, error=>{
    console.log(error);
  })


}
}
