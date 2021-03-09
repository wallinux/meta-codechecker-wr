SUMMARY = "Packagegroup for CodeChecker WRLCI enabled packages"

inherit packagegroup

RDEPENDS_${PN} += "bash"
RDEPENDS_${PN} += "ptest-runner"

do_cleanall[depends] = "\
bash:do_cleanall \
ptest-runner:do_cleanall \
"
