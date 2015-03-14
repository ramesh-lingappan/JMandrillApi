# Java Mandrill Api Library
A simple work in progress api wrapper for [Mandrill Api](https://mandrillapp.com/api/docs/) Services. 

## Dependencies 

- Jackson Libraries (core, databind, annotation)

no other dependencies!!

## Reference  

- this library is build using the reference from [Lutung Mandrill Api Wrapper](https://github.com/rschreijer/lutung)

Abstracting base services, removing apache dependencies

## Examples 

##### User Info Api 

```Java
MandrillApi mandrillApi = new  MandrillApi("<mandrill api key>");

// default response content type is json
MandrillUserInfo userInfo  = mandrillApi.users().info();
```

still working on this will add more services 


