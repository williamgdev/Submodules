# Submodules
https://github.com/blog/2104-working-with-submodules
# Git-SubModules
`Add git as a submodule` - 
```sh
$ git submodule add https://github.com/williamgdev/RestAPI.git Libraries/RestAPI/
```
> Note: That Android can get confused if you are adding a submodule and the folder has the same name.

`Pull changes from remote`
```sh
$ git submodule update --recursive --remote
```