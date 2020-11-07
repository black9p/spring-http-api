package me.black9p.server.sample.controller

import me.black9p.server.sample.dto.Header
import me.black9p.server.sample.dto.Information
import me.black9p.server.sample.dto.Response
import me.black9p.server.sample.dto.SampleDTO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Sample API
 * @author black9p
 */
@RestController
class SampleController {

    @GetMapping("/samples")
    fun getSamples() = Response(
            Header(MediaType.APPLICATION_JSON_VALUE, "Bearer abcdefgxxx"),
            Information(1, 10),
            arrayOf(SampleDTO(1, "Sample 1", "Sample ID is 1"), SampleDTO(2, "Sample 2", "Sample ID is 2"))
    )

    @GetMapping("/samples/{id}")
    fun getSample(@PathVariable id: Long) = Response(
            Header(MediaType.APPLICATION_JSON_VALUE, "Bearer abcdefgxxx"),
            Information(1, 10),
            SampleDTO(id, "Sample $id", "Sample ID is $id")
    )
}