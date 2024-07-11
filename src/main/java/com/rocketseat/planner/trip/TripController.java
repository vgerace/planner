package com.rocketseat.planner.trip;

import com.rocketseat.planner.activity.ActivityData;
import com.rocketseat.planner.activity.ActivityRequestPayload;
import com.rocketseat.planner.activity.ActivityResponse;
import com.rocketseat.planner.activity.ActivityService;
import com.rocketseat.planner.link.LinkData;
import com.rocketseat.planner.link.LinkRequestPayload;
import com.rocketseat.planner.link.LinkResponse;
import com.rocketseat.planner.participant.ParticipantCreateResponse;
import com.rocketseat.planner.participant.ParticipantData;
import com.rocketseat.planner.participant.ParticipantRequestPayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/trips")
@RequiredArgsConstructor

public class TripController {
    private final TripService tripService;
    private final ActivityService activityService;

    @PostMapping
    public ResponseEntity<TripCreateResponse> createTrip(@RequestBody TripRequestPayload payload) {
        TripCreateResponse newTrip = this.tripService.saveTrip(payload);
        return ResponseEntity.ok(newTrip);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TripResponse> getTripDetails(@PathVariable UUID id) {
        TripResponse response = this.tripService.getTripDetails(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TripResponse> updateTripDetails(@PathVariable UUID id, @RequestBody TripRequestPayload payload) {
        TripResponse response = tripService.updateTrip(id, payload);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}/confirm")
    public ResponseEntity<TripResponse> confirmTripDetails(@PathVariable UUID id) {
        TripResponse response = tripService.confirmTrip(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/{id}/activities")
    public ResponseEntity<ActivityResponse> registerActivity(@PathVariable UUID id, @RequestBody ActivityRequestPayload payload) {
        ActivityResponse activityResponse = tripService.saveActivity(id, payload);
        return ResponseEntity.ok(activityResponse);
    }

    @GetMapping("{id}/activities")
    public ResponseEntity<List<ActivityData>> getAllActivities(@PathVariable UUID id) {
        List<ActivityData> activityDataList = this.tripService.getAllActivitiesTrip(id);
        return ResponseEntity.ok(activityDataList);
    }

    @PostMapping("/{id}/invite")
    public ResponseEntity<ParticipantCreateResponse> inviteParticipant(@PathVariable UUID id, @RequestBody ParticipantRequestPayload payload) {
        ParticipantCreateResponse participantCreateResponse = this.tripService.inviteParticipant(id, payload);
        return ResponseEntity.ok(participantCreateResponse);
    }

    @GetMapping("{id}/participants")
    public ResponseEntity<List<ParticipantData>> getAllParticipants(@PathVariable UUID id) {
        List<ParticipantData> participantDataList = this.tripService.getAllParticipantsTrip(id);
        return ResponseEntity.ok(participantDataList);
    }

    @PostMapping("/{id}/links")
    public ResponseEntity<LinkResponse> registerLink(@PathVariable UUID id, @RequestBody LinkRequestPayload payload) {
        LinkResponse linkResponse = this.tripService.saveLink(id, payload);
        return ResponseEntity.ok(linkResponse);
    }

    @GetMapping("{id}/links")
    public ResponseEntity<List<LinkData>> getAllLinks(@PathVariable UUID id) {
        List<LinkData> linkDataList = this.tripService.getAllLinksTrip(id);
        return ResponseEntity.ok(linkDataList);

    }
}
