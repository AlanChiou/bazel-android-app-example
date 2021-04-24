# https://docs.bazel.build/versions/master/be/android.html#android_sdk_repository
android_sdk_repository(
    name = "androidsdk",
    api_level = 30,
    build_tools_version = "30.0.3"
)

# Kotlin
# https://github.com/bazelbuild/rules_kotlin
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_kotlin_version = "v1.5.0-alpha-3"
rules_kotlin_sha = "eeae65f973b70896e474c57aa7681e444d7a5446d9ec0a59bb88c59fc263ff62"
http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % rules_kotlin_version],
    sha256 = rules_kotlin_sha,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")
kotlin_repositories() # if you want the default.
kt_register_toolchains() # to use the default toolchain.