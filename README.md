# capstan-lein-plugin

A Leiningen plugin to generate a Capstan project skeleton

**[Capstan](https://github.com/cloudius-systems/capstan)** is a tool for rapidly building and running your application
on OSv. Capstan is as simple and fast as using Docker for creating
containers, but the result is a complete virtual machine image that
will run on any hypervisor with OSv support.

This plugin will help you starts using Capstan, by generating a
clojure project skeleton

## Prerequisites

* [capstan](https://github.com/cloudius-systems/capstan)
* [lein](https://github.com/technomancy/leiningen)

## Install
No installation needed - 
plugin is available from Clojars

## Usage
create a new project skeleton
```
lein new capstan my-project
```

run your project on a OSv image
```
cd my-project
capstan run
```

on how to run your image on the cloud, and much more [here](https://github.com/cloudius-systems/capstan)

## License

3-clause BSD license
http://opensource.org/licenses/BSD-3-Clause
