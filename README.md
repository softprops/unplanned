# unplanned

My simple answer to `python -m SimpleHTTPServer` using [unfiltered](https://github.com/n8han/Unfiltered/)

## install

Create a [conscript](https://github.com/n8han/conscript/#README)

    cs softprops/unplanned

This will create an executable called `up` in `~/usr/bin`

or you can go old school and create a self contained executable by hand

    git clone git://github.com/softprops/unplanned.git && cd unplanned
    sbt update assembly
    cp target/scala_2.7.7/unplanned.jar path/to/somewhere/in/$PATH
    # put in a shell script
    echo 'java -Xmx512M -jar `dirname $0`/unplanned.jar "$@"' > path/to/somewhere/in/$PATH/up

## usage

serve anything from anywhere

    cd path/to/anywhere/
    unp

This will start an http server serving static content from your current directory* on `0.0.0.0:{the_next_available_port}`

    cd path/to/anywhere/
    un -p 1234

This will start an http server the same as above but with an explicit port `1234`

* The directory must be writable. The unplanned server writes an empty temp file in the current working directory called `.here` for context

doug tangren (softprops) 2011
