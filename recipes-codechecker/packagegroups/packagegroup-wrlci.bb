SUMMARY = "Packagegroup for CodeChecker WRLCI enabled packages"

inherit packagegroup

RDEPENDS_${PN} += "bash"

do_cleanall[depends] = "\
bash:do_cleanall \
"
