package com.Gebeya.FairFlow.controller;

import com.Gebeya.FairFlow.model.dto.NotificationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    @PostMapping("/send")
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationDto notificationDto) {
        // No actual notification sending logic, just return OK status
        return ResponseEntity.ok().build();
    }
}
