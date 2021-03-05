SUMMARY = "Packagegroup for CodeChecker CCM enabled packages"

inherit packagegroup

RDEPENDS_${PN} += "babeltrace"
RDEPENDS_${PN} += "babeltrace2"
RDEPENDS_${PN} += "hostapd"
RDEPENDS_${PN} += "jemalloc"
RDEPENDS_${PN} += "kea"
RDEPENDS_${PN} += "liburcu"
RDEPENDS_${PN} += "libyang"
RDEPENDS_${PN} += "lttng-tools"
RDEPENDS_${PN} += "lttng-ust"
RDEPENDS_${PN} += "minicoredumper"
RDEPENDS_${PN} += "net-snmp"
RDEPENDS_${PN} += "ptest-runner"
RDEPENDS_${PN} += "simplepingpong"
RDEPENDS_${PN} += "strongswan"
RDEPENDS_${PN} += "unionmount-testsuite"
RDEPENDS_${PN} += "wpa-supplicant"
RDEPENDS_${PN} += "wratbench"

do_cleanall[depends] = "\
babeltrace2:do_cleanall \
babeltrace:do_cleanall \
hostapd:do_cleanall \
jemalloc:do_cleanall \
kea:do_cleanall \
liburcu:do_cleanall \
libyang:do_cleanall \
lttng-tools:do_cleanall \
lttng-ust:do_cleanall \
minicoredumper:do_cleanall \
net-snmp:do_cleanall \
ptest-runner:do_cleanall \
simplepingpong:do_cleanall \
strongswan:do_cleanall \
unionmount-testsuite:do_cleanall \
wpa-supplicant:do_cleanall \
wratbench:do_cleanall \
"
