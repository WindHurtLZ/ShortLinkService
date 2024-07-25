package org.myproject.shortlink.project.controller;

import lombok.RequiredArgsConstructor;
import org.myproject.shortlink.project.common.convention.result.Result;
import org.myproject.shortlink.project.common.convention.result.Results;
import org.myproject.shortlink.project.dto.req.linkCreateReqDTO;
import org.myproject.shortlink.project.dto.resp.linkCreateRespDTO;
import org.myproject.shortlink.project.service.LinkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Short-link Control Layer
 */
@RestController
@RequiredArgsConstructor
public class LinkController {

    private final LinkService linkService;

    @PostMapping("/api/short-link/v1/create")
    public Result<linkCreateRespDTO> createLink(@RequestBody linkCreateReqDTO requestParam) {
        return Results.success(linkService.createLink(requestParam));
    }
}
