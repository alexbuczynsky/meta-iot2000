require recipes-devtools/nodejs/nodejs_6.inc
require recipes-devtools/nodejs/nodejs_lts.inc

INC_PR = "r1"

LIC_FILES_CHKSUM = "file://LICENSE;md5=14152103612601231d62308345463670"

SRC_URI += "file://0001-nodejs-add-compile-flag-options-for-quark.patch"

SRC_URI[src.md5sum] = "cdb05982df9299451d257565fe0b0b3a"
SRC_URI[src.sha256sum] = "641a15fa822710ef2dc99793fec48d2a8ef75de0040b86568563d4ab296137ef"
