# capstan-lein-plugin

A Leiningen plugin to generate a Capstan clojure project skeleton

Capstan[2] is a tool for rapidly building and running your application
on OSv. Capstan is as simple and fast as using Docker for creating
containers, but the result is a complete virtual machine image that
will run on any hypervisor with OSv support.

This plugin will help you starts using Capstan, by generating a
clojure project skeleton

## Prerequisites

* Leiningen[1]
* Capstan[2]

[1]: https://github.com/technomancy/leiningen
[2]: https://github.com/cloudius-systems/capstan

## Install
No installation needed
plugin is available from Clojars

## Usage
create a new project skeleton
$ lein new capstan my-project

run your project on a OSv image
$ cd my-project
$ capstan run


## License

3-clause BSD license
http://opensource.org/licenses/BSD-3-Clause
