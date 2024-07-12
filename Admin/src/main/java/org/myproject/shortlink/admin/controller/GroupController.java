package org.myproject.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.myproject.shortlink.admin.service.GroupService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Group Management Layer
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
}
