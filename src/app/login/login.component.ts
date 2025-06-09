import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule, HttpClientModule,CommonModule],
  templateUrl: './login.component.html',

  styleUrl: './login.component.css'
})
export class LoginComponent {
data = new FormGroup({
  userId: new FormControl('', Validators.required),
  password: new FormControl('', Validators.required)
});

constructor(private httpClient: HttpClient){}
 public handleSubmit(){
  console.log(this.data.value);
  this.httpClient.post('http://localhost:8081/api/loginUser', this.data.value).subscribe((data:any) =>{
    console.log(data);
    if(data == true){
      alert("Login successfully");
    }
    else{
      alert("Wrong credentials please try again");
    }
  });
 }
}
