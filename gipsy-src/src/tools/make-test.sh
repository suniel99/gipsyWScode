#!/bin/bash

#
# This is to test whether we are compiling on UNIX
# or Linux to select appropriate version of GNU make, which
# goes by the name of 'gmake' under UNIX-based platform,
# and simply 'make' under Linux and Cygwin. 'gmake' is the safest
# name to test for, since it sometimes appears as a symlink under
# Linux as well.
#
# $Header: /cvsroot/gipsy/gipsy/src/tools/make-test.sh,v 1.1 2004/07/12 23:32:52 mokhov Exp $
#

gmake -v > /dev/null 2>&1

if [ $? == 0 ]; then
	echo -n "g"
fi

echo -n "make"

# EOF
