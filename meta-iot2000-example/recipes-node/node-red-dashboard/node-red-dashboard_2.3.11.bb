# Recipe created by recipetool

SUMMARY = "A set of dashboard nodes for Node-RED"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "Apache-2.0 & MIT & ISC"
LIC_FILES_CHKSUM = "file://license.js;md5=3af45c3f670383e916fc1118d7efeac0 \
                    file://LICENSE;md5=1a71c626ebb67c76cc9003730b1ab94c \
                    file://node_modules/serve-static/LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/serve-static/node_modules/send/LICENSE;md5=df2b0938eba0709b77ac937e2d552b7a \
                    file://node_modules/serve-static/node_modules/send/node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/serve-static/node_modules/send/node_modules/on-finished/node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/serve-static/node_modules/send/node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/serve-static/node_modules/send/node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/serve-static/node_modules/send/node_modules/http-errors/node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/serve-static/node_modules/send/node_modules/http-errors/node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/serve-static/node_modules/send/node_modules/http-errors/node_modules/statuses/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/serve-static/node_modules/send/node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/serve-static/node_modules/send/node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/serve-static/node_modules/send/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serve-static/node_modules/send/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/serve-static/node_modules/send/node_modules/depd/LICENSE;md5=89378960d0c54c30539e50c7a78ce846 \
                    file://node_modules/serve-static/node_modules/send/node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/serve-static/node_modules/send/node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/serve-static/node_modules/send/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/serve-static/node_modules/send/node_modules/mime/LICENSE;md5=8eab89930e0b484cd991ed4a155f74f7 \
                    file://node_modules/serve-static/node_modules/send/node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/serve-static/node_modules/send/node_modules/statuses/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/serve-static/node_modules/send/node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/serve-static/node_modules/parseurl/LICENSE;md5=f2a528765fa86a33fb7f85f3d9a1b5dd \
                    file://node_modules/serve-static/node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/serve-static/node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/socket.io/LICENSE;md5=840e970f9a996b991a874fcb265b0856 \
                    file://node_modules/socket.io/node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io/node_modules/socket.io-parser/node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/socket.io/node_modules/socket.io-parser/node_modules/json3/LICENSE;md5=e23ee4c29fcae2eae419990afd891c74 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/node_modules/socket.io-parser/node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/node_modules/socket.io-parser/node_modules/json3/LICENSE;md5=e23ee4c29fcae2eae419990afd891c74 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io/node_modules/socket.io-adapter/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io/node_modules/has-binary/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/socket.io/node_modules/engine.io/LICENSE;md5=c9f272e8d85e84d214436bc09de14478 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/ws/node_modules/ultron/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/base64id/LICENSE;md5=abb57c73ecaa9ddaa151a4e424935b47 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/accepts/node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/accepts/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/accepts/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/engine.io-parser/LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/engine.io-parser/node_modules/has-binary/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/engine.io-parser/node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/engine.io-parser/node_modules/wtf-8/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/socket.io/node_modules/engine.io/node_modules/engine.io-parser/node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/socket.io/node_modules/socket.io-client/LICENSE;md5=b034b27f54cd5a363360fd9207438a01 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/socket.io-parser/LICENSE;md5=afbe5b2f47d5cf306759fe2d435b5ee0 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/socket.io-parser/node_modules/json3/LICENSE;md5=e23ee4c29fcae2eae419990afd891c74 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/has-binary/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/parseuri/LICENSE;md5=b2f87f2456eb667f9260f2af3347b45e \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/LICENSE;md5=ff6b9e6830cdd3c4c2c4266dc0b91a86 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/parseqs/LICENSE;md5=b9aac4548c7c97ac7028d5b2b111b19a \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/xmlhttprequest-ssl/LICENSE;md5=cbfa18387b1df27866558353235d1cde \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/parseuri/LICENSE;md5=b2f87f2456eb667f9260f2af3347b45e \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/ws/node_modules/ultron/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/parsejson/LICENSE;md5=b9aac4548c7c97ac7028d5b2b111b19a \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/yeast/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/LICENSE;md5=436a2c205caafa17c010702768e0bed0 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/has-binary/LICENSE;md5=ea88943e21663beb2f4203005de54d51 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/after/LICENCE;md5=013fe0a3fb8c715466a12185bc36727b \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/wtf-8/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/engine.io-client/node_modules/engine.io-parser/node_modules/base64-arraybuffer/LICENSE-MIT;md5=7e6019c14540d23cd5ed7337b94782b0 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/to-array/LICENCE;md5=8966d3100f2d871ee216d056c0ea0160 \
                    file://node_modules/socket.io/node_modules/socket.io-client/node_modules/component-emitter/LICENSE;md5=ee4aea2d350b7bdbf93e14297dcdd8a2"

SRC_URI = "npm://registry.npmjs.org;name=node-red-dashboard;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm-manual-inst

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-serve-static-encodeurl = "MIT"
LICENSE_${PN}-serve-static-escape-html = "MIT"
LICENSE_${PN}-serve-static-parseurl = "MIT"
LICENSE_${PN}-serve-static-send-debug-ms = "MIT"
LICENSE_${PN}-serve-static-send-debug = "MIT"
LICENSE_${PN}-serve-static-send-depd = "MIT"
LICENSE_${PN}-serve-static-send-destroy = "MIT"
LICENSE_${PN}-serve-static-send-encodeurl = "MIT"
LICENSE_${PN}-serve-static-send-escape-html = "MIT"
LICENSE_${PN}-serve-static-send-etag = "MIT"
LICENSE_${PN}-serve-static-send-fresh = "MIT"
LICENSE_${PN}-serve-static-send-http-errors-depd = "MIT"
LICENSE_${PN}-serve-static-send-http-errors-inherits = "ISC"
LICENSE_${PN}-serve-static-send-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-serve-static-send-http-errors-statuses = "MIT"
LICENSE_${PN}-serve-static-send-http-errors = "MIT"
LICENSE_${PN}-serve-static-send-mime = "MIT"
LICENSE_${PN}-serve-static-send-ms = "MIT"
LICENSE_${PN}-serve-static-send-on-finished-ee-first = "MIT"
LICENSE_${PN}-serve-static-send-on-finished = "MIT"
LICENSE_${PN}-serve-static-send-range-parser = "MIT"
LICENSE_${PN}-serve-static-send-statuses = "MIT"
LICENSE_${PN}-serve-static-send = "MIT"
LICENSE_${PN}-serve-static = "MIT"
LICENSE_${PN}-socket.io-debug-ms = "MIT"
LICENSE_${PN}-socket.io-debug = "MIT"
LICENSE_${PN}-socket.io-engine.io-accepts-mime-types-mime-db = "MIT"
LICENSE_${PN}-socket.io-engine.io-accepts-mime-types = "MIT"
LICENSE_${PN}-socket.io-engine.io-accepts-negotiator = "MIT"
LICENSE_${PN}-socket.io-engine.io-accepts = "MIT"
LICENSE_${PN}-socket.io-engine.io-base64id = "MIT"
LICENSE_${PN}-socket.io-engine.io-cookie = "MIT"
LICENSE_${PN}-socket.io-engine.io-debug-ms = "MIT"
LICENSE_${PN}-socket.io-engine.io-debug = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-after = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-arraybuffer.slice = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-base64-arraybuffer = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-blob = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-has-binary-isarray = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-has-binary = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser-wtf-8 = "MIT"
LICENSE_${PN}-socket.io-engine.io-engine.io-parser = "MIT"
LICENSE_${PN}-socket.io-engine.io-ws-options = "MIT"
LICENSE_${PN}-socket.io-engine.io-ws-ultron = "MIT"
LICENSE_${PN}-socket.io-engine.io-ws = "MIT"
LICENSE_${PN}-socket.io-engine.io = "MIT"
LICENSE_${PN}-socket.io-has-binary-isarray = "MIT"
LICENSE_${PN}-socket.io-has-binary = "MIT"
LICENSE_${PN}-socket.io-object-assign = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser-component-emitter = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser-isarray = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser-json3 = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter-socket.io-parser = "MIT"
LICENSE_${PN}-socket.io-socket.io-adapter = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-backo2 = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-component-bind = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-component-emitter = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-component-emitter = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-component-inherit = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-after = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-arraybuffer.slice = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-base64-arraybuffer = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-blob = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-has-binary-isarray = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-has-binary = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser-wtf-8 = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-engine.io-parser = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-has-cors = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-indexof = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parsejson-better-assert-callsite = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parsejson-better-assert = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parsejson = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseqs-better-assert-callsite = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseqs-better-assert = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseqs = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseuri-better-assert-callsite = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseuri-better-assert = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-parseuri = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-ws-options = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-ws-ultron = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-ws = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-xmlhttprequest-ssl = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client-yeast = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-engine.io-client = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-has-binary-isarray = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-has-binary = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-indexof = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-object-component = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-parseuri-better-assert-callsite = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-parseuri-better-assert = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-parseuri = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser-component-emitter = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser-isarray = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser-json3 = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-socket.io-parser = "MIT"
LICENSE_${PN}-socket.io-socket.io-client-to-array = "MIT"
LICENSE_${PN}-socket.io-socket.io-client = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser-component-emitter = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser-debug-ms = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser-debug = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser-isarray = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser-json3 = "MIT"
LICENSE_${PN}-socket.io-socket.io-parser = "MIT"
LICENSE_${PN}-socket.io = "MIT"
LICENSE_${PN} = "Apache-2.0"
