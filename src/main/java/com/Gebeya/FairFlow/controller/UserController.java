package com.Gebeya.FairFlow.controller;

import com.Gebeya.FairFlow.model.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping("/register/admin")
    public ResponseEntity<Void> registerAdmin(@RequestBody UserDto userDto) {
        // No actual admin registration logic, just return OK status
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register/agent")
    public ResponseEntity<Void> registerAgent(@RequestBody UserDto userDto) {
        // No actual agent registration logic, just return OK status
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register/representative")
    public ResponseEntity<Void> registerRepresentative(@RequestBody UserDto userDto) {
        // No actual representative registration logic, just return OK status
        return ResponseEntity.ok().build();
    }
}
