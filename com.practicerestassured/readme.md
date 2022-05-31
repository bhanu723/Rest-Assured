# Rest Assured - How to create request body using HashMap & POJO classes

### @Author: BhanuSurendra Deepala
### Email: bhanuatcts@gmail.com

### Mock service has been created using json-server with below JSON structure for this test

{
  "employees": [
    {
      "id": 123,
      "firstName": "Bhanu",
      "job": "Test Automation Engineer",
      "skils": [
        "Java",
        "Selenium",
        "RestAssured"
     			 ],
      "companyDetails": {
        "companyName": "CTS",
        "email": "bhanu@cts.com"
      }
    ]
 }