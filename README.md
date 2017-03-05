# Bndtools usergroup 

Collect some questions from https://groups.google.com/forum/#!forum/bndtools-users.

## Syn Bundle-Version with -savemanifest

Problem: MANIFEST.MF version can differ while usage of -savemanifest

Related bndtools-user group post: 

- https://groups.google.com/forum/#!topic/bndtools-users/zNcUdMEp2EM

Reproduce:

```
# git checkout syn-bundleversion
# sh gradlew  clean sleep60Seconds release
# grep Bundle-Version foo/generated/foo.host-MANIFEST.MF && manifest foo/generated/foo.host.jar | grep Bundle-Version
```
* manifest is alias for 'bnd print --manifest'

##  2 JARs for one bnd-project after: 0a3244f9e6ba33bc4302b62ca2898a4ada0be091

Problem: genrate multiple JARs from one bnd-project

Related bndtools-user group post: 
-  https://groups.google.com/forum/#!topic/bndtools-users/9ABBHk8w00w

## Test-Case problem until 436e56981214cde1f500488afec6b9b73c117007

Problem: bnd/Test-Case: header ignored for fragments

- Existing test-cases not excuted as OSGi-JUnit Tests
- Tests only executed as bundle

Than the private-classes from host not visible. 

Related bndtools-users group post: 
- https://groups.google.com/forum/#!topic/bndtools-users/PRHmD1zUA68

