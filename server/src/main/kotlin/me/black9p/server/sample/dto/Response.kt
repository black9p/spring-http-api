package me.black9p.server.sample.dto

/**
 * @author black9p
 */
class Response <T>(
        val header: Header,
        val info: Information,
        val body: T
)

class Header (val contentType: String, val authorization: String)
class Information (val start: Int, val end: Int)