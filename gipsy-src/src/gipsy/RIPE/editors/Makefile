# General Editors Makefile
# Serguei Mokhov
#
# $Header: /cvsroot/gipsy/gipsy/src/gipsy/RIPE/editors/Makefile,v 1.4 2005/09/05 02:54:43 mokhov Exp $
#

BASE_GIPSY_DIR=../../..

include $(BASE_GIPSY_DIR)/../Makefile.global

LIB_GIPSY_DIR = $(BASE_GIPSY_DIR)/../lib
CLASSPATH = $(LIB_GIPSY_DIR)/netcdfAll.jar:$(LIB_GIPSY_DIR)/marf.jar:.

JFLAGS = $(COMMONJFLAGS) -classpath $(CLASSPATH) -sourcepath $(BASE_GIPSY_DIR)
JAVAC = javac

CLASSFILES = \
	TextualEditor.class

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $< >> compile.log 2>&1

all: $(CLASSFILES)
	$(MAKE) -C DFGEditor $@
	$(MAKE) -C WebEditor $@

TextualEditor.class: TextualEditor.java

clean:
	rm -f $(CLASSFILES)
	$(MAKE) -C DFGEditor $@
	$(MAKE) -C WebEditor $@

maintainer-clean: clean
	rm -f *.log *.diff
	$(MAKE) -C DFGEditor $@
	$(MAKE) -C WebEditor $@

# EOF
