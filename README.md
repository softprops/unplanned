# unplanned

my simple answer to `python -m SimpleHTTPServer` using [unfiltered](https://github.com/n8han/Unfiltered/)

# install

create an executable

    git clone git://github.com/softprops/unplanned.git && cd unplanned
    sbt update assembly
    cp target/scala_2.7.7/unplanned.jar path/to/somewhere/in/$PATH
    echo 'java -Xmx512M -jar `dirname $0`/unplanned.jar "$@"' > path/to/somewhere/in/$PATH

serve anything anywhere

    cd path/to/anywhere/
    unplanned

this will start an http server serving static content from your current directory* on `0.0.0.0:{the_next_available_port}`

doug tangren (softprops) 2011
