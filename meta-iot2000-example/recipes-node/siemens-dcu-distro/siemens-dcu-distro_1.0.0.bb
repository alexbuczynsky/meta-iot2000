# Recipe created by recipetool

SUMMARY = "The sample siemens dcu image..."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5a1ff81f6ad90b88ba24f2a1fd4db83"

SRC_URI = "version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
LICENSE_${PN} = "MIT"
