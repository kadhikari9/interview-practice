package com.test.task.api;
import com.test.task.dto.Request;
import com.test.task.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XMLRequestHandler {

    @RequestMapping(value = "/xmlRequest", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<String> xmlRequest(@RequestBody Request request) {
        Response response = new Response();
        response.setMessage("Hello, " + request.getName());

        return new ResponseEntity<>(response.toString(), HttpStatus.OK);
    }

}